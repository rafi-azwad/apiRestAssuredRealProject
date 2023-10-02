package dbEntity.setting;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table( name = "setting" )
public class Setting {

	@Id
	@Column( name = "setting_key" )
	private SettingType key;

	@Column( name = "value", columnDefinition = "TEXT" )
	private String value;
	
	@Column( name = "changedBy" )
	private Long changedBy;
}
