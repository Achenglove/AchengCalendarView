package com.ccr.calendarview.listener;

/**
 * 在此写用途
 *
 * @Author: Acheng
 * @Email: 345887272@qq.com
 * @Date: 2017-08-07 10:45
 * @Version: V1.0 <描述当前版本功能>
 */

public interface OnPagerChangeListener {
    /**
     * @param date date[0]年份  date[1]月份  date[2]日
     */
    void onPagerChanged(int[] date);
}
