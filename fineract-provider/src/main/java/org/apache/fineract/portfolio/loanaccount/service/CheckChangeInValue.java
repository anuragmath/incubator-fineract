package org.apache.fineract.portfolio.loanaccount.service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

public class CheckChangeInValue {
    
    public boolean differenceExistsTime(final LocalDateTime baseValue, final LocalDateTime workingCopyValue) {
        boolean differenceExists = false;

        if (baseValue != null) {
            differenceExists = !baseValue.equals(workingCopyValue);
        } else {
            differenceExists = workingCopyValue != null;
        }

        return differenceExists;
    }

 
    public boolean differenceExists(final LocalDate baseValue, final LocalDate workingCopyValue) {
        boolean differenceExists = false;

        if (baseValue != null) {
            differenceExists = !baseValue.equals(workingCopyValue);
        } else {
            differenceExists = workingCopyValue != null;
        }

        return differenceExists;
    }
    
    public boolean differenceExists(final LocalDate baseValue, final Date workingCopyValue) {
        boolean differenceExists = false;

        if (baseValue != null) {
            differenceExists = !baseValue.equals(workingCopyValue);
        } else {
            differenceExists = workingCopyValue != null;
        }

        return differenceExists;
    }

    public boolean differenceExists(final String baseValue, final String workingCopyValue) {
        boolean differenceExists = false;

        if (StringUtils.isNotBlank(baseValue)) {
            differenceExists = !baseValue.equals(workingCopyValue);
        } else {
            differenceExists = StringUtils.isNotBlank(workingCopyValue);
        }

        return differenceExists;
    }

    public boolean differenceExists(final String[] baseValue, final String[] workingCopyValue) {
        Arrays.sort(baseValue);
        Arrays.sort(workingCopyValue);
        return !Arrays.equals(baseValue, workingCopyValue);
    }

    public boolean differenceExists(final Number baseValue, final Number workingCopyValue) {
        boolean differenceExists = false;

        if (baseValue != null) {
            if (workingCopyValue != null) {
                differenceExists = !baseValue.equals(workingCopyValue);
            } else {
                differenceExists = true;
            }
        } else {
            differenceExists = workingCopyValue != null;
        }

        return differenceExists;
    }

    public boolean differenceExists(final BigDecimal baseValue, final BigDecimal workingCopyValue) {
        boolean differenceExists = false;

        if (baseValue != null) {
            if (workingCopyValue != null) {
                differenceExists = baseValue.compareTo(workingCopyValue) != 0;
            } else {
                differenceExists = true;
            }
        } else {
            differenceExists = workingCopyValue != null;
        }

        return differenceExists;
    }

    public boolean differenceExists(final Boolean baseValue, final Boolean workingCopyValue) {
        boolean differenceExists = false;

        if (baseValue != null) {
            differenceExists = !baseValue.equals(workingCopyValue);
        } else {
            differenceExists = workingCopyValue != null;
        }

        return differenceExists;
    }


}
