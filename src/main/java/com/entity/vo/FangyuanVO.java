package com.entity.vo;

import com.entity.FangyuanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 房源信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("fangyuan")
public class FangyuanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 小区名称
     */

    @TableField(value = "fangyuan_name")
    private String fangyuanName;


    /**
     * 户型家具
     */

    @TableField(value = "fangyuan_types")
    private Integer fangyuanTypes;


    /**
     * 租售类型
     */

    @TableField(value = "zushou_types")
    private Integer zushouTypes;


    /**
     * 房间图片
     */

    @TableField(value = "fangyuan_photo")
    private String fangyuanPhoto;


    /**
     * 具体位置
     */

    @TableField(value = "fangyuan_chufadi")
    private String fangyuanChufadi;


    /**
     * 面积
     */

    @TableField(value = "fangyuan_mianji")
    private String fangyuanMianji;


    /**
     * 房东
     */

    @TableField(value = "fangdong_name")
    private String fangdongName;


    /**
     * 房东电话
     */

    @TableField(value = "fangdong_phone")
    private String fangdongPhone;


    /**
     * 价格
     */

    @TableField(value = "fangyuan_jiage")
    private String fangyuanJiage;


    /**
     * 详情
     */

    @TableField(value = "fangyuan_content")
    private String fangyuanContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：小区名称
	 */
    public String getFangyuanName() {
        return fangyuanName;
    }


    /**
	 * 获取：小区名称
	 */

    public void setFangyuanName(String fangyuanName) {
        this.fangyuanName = fangyuanName;
    }
    /**
	 * 设置：户型家具
	 */
    public Integer getFangyuanTypes() {
        return fangyuanTypes;
    }


    /**
	 * 获取：户型家具
	 */

    public void setFangyuanTypes(Integer fangyuanTypes) {
        this.fangyuanTypes = fangyuanTypes;
    }
    /**
	 * 设置：租售类型
	 */
    public Integer getZushouTypes() {
        return zushouTypes;
    }


    /**
	 * 获取：租售类型
	 */

    public void setZushouTypes(Integer zushouTypes) {
        this.zushouTypes = zushouTypes;
    }
    /**
	 * 设置：房间图片
	 */
    public String getFangyuanPhoto() {
        return fangyuanPhoto;
    }


    /**
	 * 获取：房间图片
	 */

    public void setFangyuanPhoto(String fangyuanPhoto) {
        this.fangyuanPhoto = fangyuanPhoto;
    }
    /**
	 * 设置：具体位置
	 */
    public String getFangyuanChufadi() {
        return fangyuanChufadi;
    }


    /**
	 * 获取：具体位置
	 */

    public void setFangyuanChufadi(String fangyuanChufadi) {
        this.fangyuanChufadi = fangyuanChufadi;
    }
    /**
	 * 设置：面积
	 */
    public String getFangyuanMianji() {
        return fangyuanMianji;
    }


    /**
	 * 获取：面积
	 */

    public void setFangyuanMianji(String fangyuanMianji) {
        this.fangyuanMianji = fangyuanMianji;
    }
    /**
	 * 设置：房东
	 */
    public String getFangdongName() {
        return fangdongName;
    }


    /**
	 * 获取：房东
	 */

    public void setFangdongName(String fangdongName) {
        this.fangdongName = fangdongName;
    }
    /**
	 * 设置：房东电话
	 */
    public String getFangdongPhone() {
        return fangdongPhone;
    }


    /**
	 * 获取：房东电话
	 */

    public void setFangdongPhone(String fangdongPhone) {
        this.fangdongPhone = fangdongPhone;
    }
    /**
	 * 设置：价格
	 */
    public String getFangyuanJiage() {
        return fangyuanJiage;
    }


    /**
	 * 获取：价格
	 */

    public void setFangyuanJiage(String fangyuanJiage) {
        this.fangyuanJiage = fangyuanJiage;
    }
    /**
	 * 设置：详情
	 */
    public String getFangyuanContent() {
        return fangyuanContent;
    }


    /**
	 * 获取：详情
	 */

    public void setFangyuanContent(String fangyuanContent) {
        this.fangyuanContent = fangyuanContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
