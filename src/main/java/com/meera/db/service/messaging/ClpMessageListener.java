package com.meera.db.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.meera.db.service.BankOrganizationLocalServiceUtil;
import com.meera.db.service.ClpSerializer;
import com.meera.db.service.EmployeeLocalServiceUtil;
import com.meera.db.service.JobDirectoryLocalServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            BankOrganizationLocalServiceUtil.clearService();

            EmployeeLocalServiceUtil.clearService();

            JobDirectoryLocalServiceUtil.clearService();
        }
    }
}
