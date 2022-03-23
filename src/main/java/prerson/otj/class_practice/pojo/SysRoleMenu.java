package prerson.otj.class_practice.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sys_role_menu", schema = "friday", catalog = "")
@IdClass(SysRoleMenuPK.class)
public class SysRoleMenu {
    private Long roleId;
    private Long menuId;

    @Id
    @Column(name = "role_id")
    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Id
    @Column(name = "menu_id")
    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysRoleMenu that = (SysRoleMenu) o;
        return roleId == that.roleId &&
                menuId == that.menuId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, menuId);
    }
}
