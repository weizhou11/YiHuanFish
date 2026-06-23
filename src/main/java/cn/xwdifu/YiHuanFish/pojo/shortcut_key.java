package cn.xwdifu.YiHuanFish.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class shortcut_key {
    /*
     * 全局快捷键变量
     * */

    private int start_stop_key;//启动停止快捷键
    private int exit_key;//退出快捷键
    private int crop_bar_session_key;//临时截取进度条快捷键
    private int crop_click_session_key;//临时截取点击区域快捷键
    private int crop_click_permanent_key;//永久截取点击区域快捷键
    private int crop_bar_permanent_key;//永久截取进度条快捷键

}
