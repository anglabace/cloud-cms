package com.hq.biz.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author huang
 * @since 2018-07-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_role")
public class Role extends Model<Role> {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;
    @TableField("roleName")
    private String roleName;
    @TableField("roleCode")
    private String roleCode;
    @TableField("useFlag")
    private Integer useFlag;
    @TableField("delFlag")
    private Integer delFlag;
    @TableField("createTime")
    private Date createTime;
    @TableField("createUser")
    private String createUser;
    @TableField("updateTime")
    private Date updateTime;
    @TableField("updateUser")
    private String updateUser;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
