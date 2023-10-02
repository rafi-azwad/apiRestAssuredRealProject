package dbEntity.series;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
@Entity
@Table( name = "series" )
@IdClass( SeriesId.class )
public class Series implements Cloneable{

    @Id
    @Column( name = "type" )
    private SeriesType type;

    @Id
    @Column( name = "name" )
    private String name;

    @Column( name = "code" )
    private String code;

    @Column( name = "season" )
    private String season;

    @Column( name = "series_serial_code" )
    private String seriesSerialCode;

    @Column( name = "last_value" )
    private Long lastValue;

    @Override
    public Series clone() {
        Series series = new Series();
        BeanUtils.copyProperties( this, series );
        return series;
    }
}
