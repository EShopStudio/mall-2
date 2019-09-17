package com.perenc.mall.platform.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * @ClassName: BannerDTO
 * @Description: 轮播图上传数据
 *
 * @Author: GR
 * @Date: 2019/9/17 11:35 
 *
 * Modification History:
 * Date         Author      Description
 *---------------------------------------------------------*
 * 2019/9/17     GR     		
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor(staticName = "build")
public class BannerDTO {
    private Integer id;
    @NotBlank(message = "title不能为空")
    private String title;
    @NotBlank(message = "fileUrl不能为空")
    private String fileUrl;
    @Min(value = 0, message = "sort不能为空")
    private Integer sort;
    private String desc;
    @Min(value = 0, message = "skipType不能为空")
    private Integer skipType;
    @NotBlank(message = "skipContent不能为空")
    private String skipContent;
    private Integer status;
}