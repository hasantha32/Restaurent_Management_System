package Reservation;

import java.awt.Color;
import java.util.Date;

import com.toedter.calendar.DateUtil;
import com.toedter.calendar.IDateEvaluator;

class RangeEvaluator implements IDateEvaluator {

    private DateUtil dateUtil = new DateUtil();

    @Override
    public boolean isSpecial(Date date) {
        return false;
    }

    @Override
    public Color getSpecialForegroundColor() {
        return null;
    }

    @Override
    public Color getSpecialBackroundColor() {
        return null;
    }

    @Override
    public String getSpecialTooltip() {
        return null;
    }
    @Override
    public boolean isInvalid(Date date) {
        return dateUtil.checkDate(date);
        // if the given date is in the range then is invalid
    }        

    /**
     * Sets the initial date in the range to be validated.
     * @param startDate 
     */
    public void setStartDate(Date startDate) {
        dateUtil.setMinSelectableDate(startDate);
    }

    /**
     * @return the initial date in the range to be validated.
     */
    public Date getStartDate() {
        return dateUtil.getMinSelectableDate();
    }

    /**
     * Sets the final date in the range to be validated.
     * @param endDate 
     */
    public void setEndDate(Date endDate) {
        dateUtil.setMaxSelectableDate(endDate);
    }

    /**
     * @return the final date in the range to be validated.
     */
    public Date getEndDate() {
        return dateUtil.getMaxSelectableDate();
    }

	@Override
	public Color getInvalidBackroundColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getInvalidForegroundColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getInvalidTooltip() {
		// TODO Auto-generated method stub
		return null;
	}   
}