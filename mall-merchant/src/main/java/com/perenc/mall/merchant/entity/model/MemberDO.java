package com.perenc.mall.merchant.entity.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @ClassName: MemberDO
 * @Description: 店铺会员实体类
 *
 * @Author: GR
 * @Date: 2019-9-14 17:29 
 *
 * Modification History:
 * Date         Author      Description
 *---------------------------------------------------------*
 * 2019-9-14     GR      		
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor(staticName = "build")
@TableName(value = "store_member")
public class MemberDO {
    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField("platform_member_id")
    private Integer platformMemberId;
    @TableField("store_id")
    private Integer storeId;
    private String nickname;
    private Integer coin;
    private String level;
    private Integer status;
    @TableField("create_user")
    private String createUser;
    @TableField("update_user")
    private String updateUser;
    @TableField("create_time")
    private String createTime;
    @TableField("update_time")
    private String updateTime;
}
