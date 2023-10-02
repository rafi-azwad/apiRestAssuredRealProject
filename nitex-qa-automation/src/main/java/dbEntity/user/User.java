package dbEntity.user;

import dbEntity.audit.AuditableEntity;
import dbEntity.brand.Brand;
import dbEntity.company.Company;
import dbEntity.document.Document;
import dbEntity.enums.GsysFlag;
import dbEntity.enums.Status;
import dbEntity.location.Country;
import dbEntity.organogram.OperationalUnit;
import dbEntity.supplier.FreeTextTag;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.ToString;
import org.hibernate.Hibernate;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;

import java.util.*;

@Data
@Entity
@DynamicUpdate
@Table( name = "users", uniqueConstraints = @UniqueConstraint( columnNames = { "email" }, name = "uk_users_email" ) )
@ToString( exclude = {"profilePicDocument", "company", "brand", "accountManager", "accountExecutive", "userLevel", "tagSet"} )
public class User extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "user_sequence_generator")
    @SequenceGenerator( name="user_sequence_generator", sequenceName = "user_sequence", initialValue = 1 )
    @Column( name ="id" )
    private Long id;

    @Column( name = "name" )
    private String name;

    @Column( name ="nick_name" )
    private String nickName;

    @Column( name ="email", unique = true )
    private String email;

    @Column( name = "email_verified" )
    private Boolean emailVerified = false;

    @Column( name ="phone" )
    private String phone;

    @Column( name = "phone_verified" )
    private Boolean phoneVerified = false;

    @Column( name ="address" )
    private String address;

    @Size( min = 1, max = 50 )
    @Column( name = "designation" )
    private String designation;

    @Size( min = 1, max = 50 )
    @Column( name = "department" )
    private String department;

    @Size( min = 1, max = 1000 )
    @Column( name = "linked_in_url" )
    private String linkedInUrl;

    @Size( min = 1, max = 1000 )
    @Column( name = "facebook_url" )
    private String facebookUrl;

    @Size( min = 1, max = 1000 )
    @Column( name = "twitter_url" )
    private String twitterUrl;

    @Column( name ="primary_user_type" )
    private UserType primaryUserType;

    @Column( name = "profession" )
    private Profession profession;

    @Column( name ="profession_str" )
    private String professionStr;

    @Column( name = "region" )
    private Region region;

    @Column( name = "region_str" )
    private String regionStr;

    @Column( name = "business_type")
    private BusinessType businessType;

    @Column( name = "business_type_str")
    private String businessTypeStr;

    @Column( name = "role_in_business")
    private RoleInBusiness roleInBusiness;

    @Column( name = "role_in_business_str")
    private String roleInBusinessStr;

    @Column( name = "clothing_label_status")
    private ClothingLabelStatus clothingLabelStatus;

    @Column( name ="password" )
    private String password;

    @Column( name = "auth_provider" )
    private AuthProvider provider;

    @Column( name = "provider_id" )
    private String providerId;

    @Column( name = "token" )
    private String token;

    @Column( name = "status" )
    private Status status;

    @CreationTimestamp
    @Column( name = "date_added" )
    private Date dateAdded;

    @Column( name = "contract_later_flag" )
    private Boolean contractLaterFlag = false;

    @Column( name = "is_team_lead" )
    private Boolean isTeamLead = false;

    @Column( name = "is_management" )
    private Boolean isManagement = false;

    @Column( name = "gsys_flag" )
    private GsysFlag gsysFlag = GsysFlag.LEVEL_ONE;

    @Column( name = "management_level" )
    private ManagementLevel managementLevel;

    @Column( name = "contract_later_reason" )
    private ContractLaterReason contractLaterReason;

    @Column( name = "user_inputted_brand_name" )
    private String userInputtedBrandName;

    ///project manager in other table
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "account_manager_id", foreignKey = @ForeignKey( name = "user_account_manager_id_fk") )
    private User accountManager; // this is actually project manager

    ///account manager in other table
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "account_executive_id", foreignKey = @ForeignKey( name = "user_account_executive_id_fk") )
    private User accountExecutive; // this is actually Account manager

    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true )
    @JoinColumn( name = "profile_doc_id", foreignKey = @ForeignKey( name = "user_document_id_fx" ) )
    private Document profilePicDocument;

    @OneToOne( cascade=CascadeType.ALL, fetch=FetchType.EAGER )
    @JoinColumn( name = "user_level_id", foreignKey = @ForeignKey( name = "user_user_level_fk" ) )
    private UserLevel userLevel;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "office_location_id", foreignKey = @ForeignKey( name = "fk_user_office_location_id" ) )
    private OperationalUnit officeLocation;

    @OneToOne( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinColumn( name = "company_id", foreignKey = @ForeignKey( name = "user_company_id_fk") )
    private Company company;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinColumn( name = "brand_id", foreignKey = @ForeignKey( name = "fk_user_brand_id" ) )
    private Brand brand;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "country_id", foreignKey = @ForeignKey( name = "fk_user_country_id" ) )
    private Country country;

    @Enumerated
    @ElementCollection( targetClass = UserType.class, fetch = FetchType.LAZY )
    @JoinTable( name = "user_user_type_map",
            joinColumns = @JoinColumn( name = "user_id" ),
            foreignKey = @ForeignKey( name = "fk_user_user_type_map_user_id" )
    )
    private Set<UserType> userTypeSet = new HashSet<>();

    @ManyToMany( fetch = FetchType.LAZY )
    @JoinTable( name = "user_department_map",
            joinColumns = @JoinColumn( name = "user_id" ),
            inverseJoinColumns = @JoinColumn( name = "department_id" ),
            foreignKey = @ForeignKey( name = "fk_user_department_map_user_level_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_user_department_map_department_id" )
    )
    private Set<OrganizationalDepartment> departmentSet = new HashSet<>();

    @ManyToMany( fetch = FetchType.LAZY )
    @JoinTable( name = "user_country_operational_zone_map",
            joinColumns = @JoinColumn( name = "user_id" ),
            inverseJoinColumns = @JoinColumn( name = "country_id" ),
            foreignKey = @ForeignKey( name = "fk_user_country_map_user_level_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_user_country_map_country_id" )
    )
    private Set<Country> operationalZoneSet = new HashSet<>();

    @ManyToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinTable(
            name = "user_tag_map",
            joinColumns = @JoinColumn( name = "user_id"),
            inverseJoinColumns = @JoinColumn( name = "tag_id" ),
            foreignKey = @ForeignKey( name = "fk_user_tag_map_user_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_user_tag_map_tag_id" ) )
    private Set<FreeTextTag> tagSet = new HashSet<>();

    public Boolean hasUserType( UserType userType ) {
        return Objects.equals( this.primaryUserType, userType ) || userTypeSet.contains( userType );
    }

    public Boolean hasAnyUserType( UserType... userTypes ) {
        return Arrays.stream(userTypes).anyMatch( this::hasUserType );
    }

    public Set<UserType> getAllUserTypes() {
        Set<UserType> allUserTypes = new HashSet<>( this.userTypeSet );
        allUserTypes.add( this.primaryUserType );
        return allUserTypes;
    }

    public Boolean isDirector( ) {
        return this.isManagement && ManagementLevel.DIRECTOR.equals( this.managementLevel );
    }

    public Boolean isCountryHead( ) {
        return this.isManagement && ManagementLevel.COUNTRY_HEAD.equals( this.managementLevel );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User that = (User) o;
        return Objects.equals( id, that.id );
    }

    @Override
    public int hashCode() {
        if ( this.id != null )
            return Objects.hash( this.id );
        return System.identityHashCode( this );
    }

    @PreRemove
    public void removeRelation() {
        this.profilePicDocument = null;
        this.userLevel = null;
        this.company = null;
        this.tagSet = null;
    }
}
