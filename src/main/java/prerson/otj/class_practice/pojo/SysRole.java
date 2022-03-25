package prerson.otj.class_practice.pojo;

import prerson.otj.class_practice.common.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "sys_role", schema = "friday", catalog = "")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysRole extends BaseModel {

    @Id
    @Column(name = "role_id")
    @Basic
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;
    @Basic
    @Column(name = "role_name")
    private String roleName;
    @Basic
    @Column(name = "role_key")
    private String roleKey;
    @Basic
    @Column(name = "role_sort")
    private int roleSort;
    @Basic
    @Column(name = "data_scope")
    private String dataScope;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "del_flag")
    private String delFlag;

}
