package com.since.utils;

import com.since.bo.MailBO;
import org.springframework.stereotype.Component;

/**
 * @description: 邮件工具类
 * @author: SY_zheng
 * @create: 2019-05-05
 */
public interface IMailUtils {

    /**
     * 简单邮件发送
     * @param mailBO
     * @return
     */
    Integer simpleMail(MailBO mailBO);

    // 这里可以继续些更多邮件发送形式

}