package com.ddup.quartz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.JobDetail;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-quartz.xml"})
public class TellTimeQuartzTest {

    @Test
    public void main(){
        System.out.println("Start");
        
        /*// define the job and tie it to our MyJob class
        JobDetail job = newJob(MyJob.class)
            .withIdentity("job1", "group1")
            .build();

        // Trigger the job to run now, and then repeat every 40 seconds
        Trigger trigger = newTrigger()
            .withIdentity("trigger1", "group1")
            .startNow()
            .withSchedule(simpleSchedule()
                    .withIntervalInSeconds(40)
                    .repeatForever())
            .build();

        // Tell quartz to schedule the job using our trigger
        scheduler.scheduleJob(job, trigger);*/
    }
}
