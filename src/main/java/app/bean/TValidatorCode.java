package app.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "t_validator_code")
@Data
@NamedQueries({
    @NamedQuery(name = "TValidatorCode.findAll", query = "SELECT t FROM TValidatorCode t")
    , @NamedQuery(name = "TValidatorCode.findById", query = "SELECT t FROM TValidatorCode t WHERE t.id = :id")
    , @NamedQuery(name = "TValidatorCode.findByFCode", query = "SELECT t FROM TValidatorCode t WHERE t.fCode = :fCode")
    , @NamedQuery(name = "TValidatorCode.findByFCodeId", query = "SELECT t FROM TValidatorCode t WHERE t.fCodeId = :fCodeId")
    , @NamedQuery(name = "TValidatorCode.findByFCodeType", query = "SELECT t FROM TValidatorCode t WHERE t.fCodeType = :fCodeType")
    , @NamedQuery(name = "TValidatorCode.findByFDateCreated", query = "SELECT t FROM TValidatorCode t WHERE t.fDateCreated = :fDateCreated")
    , @NamedQuery(name = "TValidatorCode.findByFDateValidate", query = "SELECT t FROM TValidatorCode t WHERE t.fDateValidate = :fDateValidate")
    , @NamedQuery(name = "TValidatorCode.findByFDeviceId", query = "SELECT t FROM TValidatorCode t WHERE t.fDeviceId = :fDeviceId")
    , @NamedQuery(name = "TValidatorCode.findByFFlag", query = "SELECT t FROM TValidatorCode t WHERE t.fFlag = :fFlag")
    , @NamedQuery(name = "TValidatorCode.findByFIpAddress", query = "SELECT t FROM TValidatorCode t WHERE t.fIpAddress = :fIpAddress")
    , @NamedQuery(name = "TValidatorCode.findByFResultValidate", query = "SELECT t FROM TValidatorCode t WHERE t.fResultValidate = :fResultValidate")
    , @NamedQuery(name = "TValidatorCode.findByFValidateText", query = "SELECT t FROM TValidatorCode t WHERE t.fValidateText = :fValidateText")})
public class TValidatorCode implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "f_code")
    private String fCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "f_code_id")
    private String fCodeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "f_code_type")
    private String fCodeType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "f_date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fDateCreated;
    @Column(name = "f_date_validate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fDateValidate;
    @Size(max = 255)
    @Column(name = "f_device_id")
    private String fDeviceId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "f_flag")
    private boolean fFlag;
    @Size(max = 60)
    @Column(name = "f_ip_address")
    private String fIpAddress;
    @Column(name = "f_result_validate")
    private Boolean fResultValidate;
    @Size(max = 255)
    @Column(name = "f_validate_text")
    private String fValidateText;

    public TValidatorCode() {
    }

    public TValidatorCode(Integer id) {
        this.id = id;
    }

    public TValidatorCode(Integer id, String fCode, String fCodeId, String fCodeType, Date fDateCreated, boolean fFlag) {
        this.id = id;
        this.fCode = fCode;
        this.fCodeId = fCodeId;
        this.fCodeType = fCodeType;
        this.fDateCreated = fDateCreated;
        this.fFlag = fFlag;
    }

}
