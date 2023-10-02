package dbEntity.setting;

import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "personal_setting" )
public class PersonalSetting {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "personal_setting_sequence" )
    @SequenceGenerator( name = "personal_setting_sequence", sequenceName = "personal_setting_sequence" )
    private Long id;

    @Column( name = "setting_key" )
    private SettingType settingType;

    @Column( name = "value", columnDefinition = "TEXT" )
    private String value;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "user_id", foreignKey = @ForeignKey( name = "personal_setting_user_id_fk" ) )
    private User user;
}
