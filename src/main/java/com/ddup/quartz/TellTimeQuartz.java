package com.ddup.quartz;
import java.util.Calendar;
import java.util.Locale;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * XXX銆�
 * 
 * <p>XXX</p>
 * <ul><li></li></ul>
 * <br>
 * <strong>Copyright</strong> 漏2013-2016 Lagou.com LLC. All Rights Reserved.<br>
 *
 * @version 1.0.0
 * @author 
 * <ul>
 * <li></li>
 * <li>alanzhang 2016骞�鏈�鏃�br></li>
 * </ul><br>
 */
/**
 * @author 30459
 *
 */
public class TellTimeQuartz implements Job {

    /* (non-Javadoc)
     * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
     */
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        Calendar calendar = Calendar.getInstance(Locale.CHINESE);
        System.out.println(calendar.getTime().toString());
    }

}
