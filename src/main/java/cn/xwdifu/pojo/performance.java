package cn.xwdifu.pojo;

public class performance {

    private int SCAN_INTERVAL_MS;//扫描间隔


    //==鼠标移动模拟配置==
    private int mouse_move_steps;//鼠标移动步数
    private int min_start_delay_ms;//鼠标开始移动最小延迟
    private int max_start_delay_ms;//鼠标开始移动最大延迟
    private int min_stop_delay_ms;//鼠标停止移动最小延迟
    private int max_stop_delay_ms;//鼠标停止移动最大延迟


    //==键盘输入延迟配置==
    private int keyboard_stop_min_delay_ms;//键盘停止输入最小延迟
    private int keyboard_stop_max_delay_ms;//键盘停止输入最大延迟
    private int keyboard_restart_min_delay_ms;//键盘重新输入最小延迟
    private int keyboard_restart_max_delay_ms;//键盘重新输入最大延迟


}
