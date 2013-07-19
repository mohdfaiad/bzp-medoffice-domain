package medoffice.entity;

import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.persistence.*;
import org.eclipse.persistence.annotations.PrivateOwned;

@Entity
@Table(name = "provider_schedule")
public class ProviderSchedule implements Serializable {

   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Integer id;
   @Basic(optional = false)
   @Column(name = "office_provider_id")
   private int officeProviderId;
   @JoinColumn(name = "office_provider_id", nullable = false, insertable = false, updatable = false)
   @ManyToOne
   private OfficeProvider officeProvider;
   @Basic(optional = false)
   @Column(name = "office_code")
   private String officeCode;
   @Basic(optional = false)
   @Column(name = "classifier_code")
   private char classifierCode;
   @Column(name = "start_date")
   @Temporal(TemporalType.TIMESTAMP)
   private Date startDate;
   @Column(name = "end_date")
   @Temporal(TemporalType.TIMESTAMP)
   private Date endDate;
   @Basic(optional = false)
   @Column(name = "except_office_holidays")
   private Boolean exceptOfficeHolidays;
   @Column(name = "notes")
   private String notes;
   @Basic(optional = false)
   @Column(name = "status_code")
   private char statusCode;
   @Column(name = "period1_code")
   private Character period1Code;
   @Basic(optional = false)
   @Column(name = "period1_every_value")
   private Integer period1EveryValue;
   @Column(name = "period2_code")
   private Character period2Code;
   @Basic(optional = false)
   @Column(name = "period2_index")
   private Integer period2Index;
   @Column(name = "period3_code")
   private Character period3Code;
   @Basic(optional = false)
   @Column(name = "period3_index")
   private Integer period3Index;
   @Column(name = "period4_code")
   private Character period4Code;
   @Basic(optional = false)
   @Column(name = "period4_index")
   private Integer period4Index;
   @Basic(optional = false)
   @Column(name = "created")
   @Temporal(TemporalType.TIMESTAMP)
   private Date created;
   @Column(name = "created_user_id")
   private Integer createdUserId;
   @Basic(optional = false)
   @Column(name = "last_updated")
   @Temporal(TemporalType.TIMESTAMP)
   private Date lastUpdated;
   @Column(name = "last_updated_user_id")
   private Integer lastUpdatedUserId;
   @PrivateOwned
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "providerSchedule")
   @OrderBy("startTime")
   private List<ProviderScheduleTime> providerScheduleTimeList;
   private static Map<Character, String> classifierMap = null;
   private static Map<Character, String> periodMap = null;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public int getOfficeProviderId() {
      return officeProviderId;
   }

   public void setOfficeProviderId(int officeProviderId) {
      this.officeProviderId = officeProviderId;
   }

   public OfficeProvider getOfficeProvider() {
      return officeProvider;
   }

   public void setOfficeProvider(OfficeProvider officeProvider) {
      this.officeProvider = officeProvider;
   }

   public String getOfficeCode() {
      return officeCode;
   }

   public void setOfficeCode(String officeCode) {
      this.officeCode = officeCode;
   }

   public char getClassifierCode() {
      return classifierCode;
   }

   public void setClassifierCode(char classifierCode) {
      this.classifierCode = classifierCode;
   }

   public Date getStartDate() {
      return startDate;
   }

   public void setStartDate(Date startDate) {
      this.startDate = startDate;
   }

   public Date getEndDate() {
      return endDate;
   }

   public void setEndDate(Date endDate) {
      this.endDate = endDate;
   }

   public Boolean getExceptOfficeHolidays() {
      return exceptOfficeHolidays;
   }

   public void setExceptOfficeHolidays(Boolean exceptOfficeHolidays) {
      this.exceptOfficeHolidays = exceptOfficeHolidays;
   }

   public String getNotes() {
      return notes;
   }

   public void setNotes(String notes) {
      this.notes = notes;
   }

   public char getStatusCode() {
      return statusCode;
   }

   public void setStatusCode(char statusCode) {
      this.statusCode = statusCode;
   }

   public Character getPeriod1Code() {
      return period1Code;
   }

   public void setPeriod1Code(Character period1Code) {
      this.period1Code = period1Code;
   }

   public Integer getPeriod1EveryValue() {
      return period1EveryValue;
   }

   public void setPeriod1EveryValue(Integer period1EveryValue) {
      if (period1EveryValue == null) {
         this.period1EveryValue = 0;
         return;
      }
      this.period1EveryValue = period1EveryValue;
   }

   public Character getPeriod2Code() {
      return period2Code;
   }

   public void setPeriod2Code(Character period2Code) {
      this.period2Code = period2Code;
   }

   public Integer getPeriod2Index() {
      return period2Index;
   }

   public void setPeriod2Index(Integer period2Index) {
      if (period2Index == null) {
         this.period2Index = 0;
         return;
      }
      this.period2Index = period2Index;
   }

   public Character getPeriod3Code() {
      return period3Code;
   }

   public void setPeriod3Code(Character period3Code) {
      this.period3Code = period3Code;
   }

   public Integer getPeriod3Index() {
      return period3Index;
   }

   public void setPeriod3Index(Integer period3Index) {
      if (period3Index == null) {
         this.period3Index = 0;
         return;
      }
      this.period3Index = period3Index;
   }

   public Character getPeriod4Code() {
      return period4Code;
   }

   public void setPeriod4Code(Character period4Code) {
      this.period4Code = period4Code;
   }

   public Integer getPeriod4Index() {
      return period4Index;
   }

   public void setPeriod4Index(Integer period4Index) {
      if (period4Index == null) {
         this.period4Index = 0;
         return;
      }
      this.period4Index = period4Index;
   }

   public Date getCreated() {
      return created;
   }

   public void setCreated(Date created) {
      this.created = created;
   }

   public Integer getCreatedUserId() {
      return createdUserId;
   }

   public void setCreatedUserId(Integer createdUserId) {
      this.createdUserId = createdUserId;
   }

   public Date getLastUpdated() {
      return lastUpdated;
   }

   public void setLastUpdated(Date lastUpdated) {
      this.lastUpdated = lastUpdated;
   }

   public Integer getLastUpdatedUserId() {
      return lastUpdatedUserId;
   }

   public void setLastUpdatedUserId(Integer lastUpdatedUserId) {
      this.lastUpdatedUserId = lastUpdatedUserId;
   }

   public List<ProviderScheduleTime> getProviderScheduleTimeList() {
      return providerScheduleTimeList;
   }

   public void setProviderScheduleTimeList(List<ProviderScheduleTime> providerScheduleTimeList) {
      this.providerScheduleTimeList = providerScheduleTimeList;
   }

   public String numberEnding(int t) {
      if ((t - 1) % 10 == 0 && t != 11) {
         return t + "st ";
      } else if ((t - 2) % 10 == 0 && t != 12) {
         return t + "nd ";
      } else if ((t - 3) % 10 == 0 && t != 13) {
         return t + "rd ";
      }
      return t + "th ";
   }

   public String getLongDayName(int t) {
      DateFormatSymbols symbols = new DateFormatSymbols(new Locale("en"));
      if (t < 7) {
         return symbols.getWeekdays()[t + 1];
      } else {
         return symbols.getWeekdays()[1];
      }
   }

   public String getPeriodDefinition() {
      String result = "";
      if (period1EveryValue == 0) {
         return "One Time";
      }
      if (period1Code != null && period1Code == 'D') {
         result = "every " + (period1EveryValue == 1 ? "" : numberEnding(period1EveryValue)) + "day";
      }
      if (period1Code != null && period1Code == 'W') {
         result = "every " + (period1EveryValue == 1 ? "" : numberEnding(period1EveryValue)) + getLongDayName(period2Index);
      }
      if (period1Code != null && period1Code == 'M') {
         if (period2Code != null && period2Code == 'D') {
            result = numberEnding(period2Index) + "day";
         } else {
            if (period2Index > 5) {
               result = "last ";
            } else {
               result = numberEnding(period2Index);
            }
            result += getLongDayName(period3Index);
         }
         result += " every " + (period1EveryValue == 1 ? "" : numberEnding(period1EveryValue)) + "month";
      }
      if (period1Code != null && period1Code == 'Y') {
         if (period2Code != null && period2Code == 'M') {
            result = numberEnding(period3Index);
            if (period3Code != null && period3Code == 'D') {
               result += "day";
            } else if (period3Code == 'W') {
               if (period3Index > 5) {
                  result = "last ";
               }
               result += getLongDayName(period4Index);
            }
            result += " ";
            if (period2Index > 12) {
               result += "last ";
            } else {
               result += numberEnding(period2Index);
            }
            result += "month";
         }
         if (period2Code != null && period2Code == 'W') {
            if (period2Index > 53) {
               result = "last ";
            } else {
               result += numberEnding(period2Index);
            }
            result += getLongDayName(period3Index);
         }
         if (period2Code != null && period2Code == 'D') {
            result += numberEnding(period2Index) + "day";
         }
         result += " every " + (period1EveryValue == 1 ? "" : numberEnding(period1EveryValue)) + "year";
      }
      return result;
   }

   public Map<Character, String> getClassifierMap() {
      if (classifierMap == null) {
         classifierMap = new LinkedHashMap();
         classifierMap.put('S', "Service");
         classifierMap.put('H', "Holiday");
         classifierMap.put('V', "Vacation");
         classifierMap.put('O', "Day Off");
      }
      return classifierMap;
   }

   public Map<Character, String> getPeriodMap() {
      if (periodMap == null) {
         periodMap = new LinkedHashMap();
         periodMap.put('Y', "Year");
         periodMap.put('M', "Month");
         periodMap.put('W', "Week");
         periodMap.put('D', "Day");
      }
      return periodMap;
   }

   public List<Character> subordinatePeriodCodeList(Character code) {
      List<Character> codeList = new ArrayList(getPeriodMap().keySet());
      if (code == null || !codeList.contains(code)) {
         return null;
      }
      return codeList.subList(codeList.indexOf(code) + 1, codeList.size());
   }

   public void incPeriod1EveryValue() {
      period1EveryValue++;
   }

   public void decPeriod1EveryValue() {
      if (period1EveryValue > 1) {
         period1EveryValue--;
      }
   }

   public void incPeriod2Index() {
      period2Index++;
   }

   public void decPeriod2Index() {
      if (period2Index > 1) {
         period2Index--;
      }
   }

   public void incPeriod3Index() {
      period3Index++;
   }

   public void decPeriod3Index() {
      if (period3Index > 1) {
         period3Index--;
      }
   }

   public void incPeriod4Index() {
      period4Index++;
   }

   public void decPeriod4Index() {
      if (period4Index > 1) {
         period4Index--;
      }
   }

   public void clearLevel(int level) {
      if (level == 1) {
         if (period1EveryValue == 0) {
            period1EveryValue = 1;
         }
         period2Index = 1;
         period2Code = null;
         period3Index = 0;
         period3Code = null;
         period4Index = 0;
         period4Code = null;
      } else if (level == 2) {
         period3Index = 1;
         period3Code = null;
         period4Index = 0;
         period4Code = null;
      } else if (level == 3) {
         period4Index = 1;
         period4Code = null;
      }
   }

   public void addScheduleTime(Date startTime, Date endTime) {
      ProviderScheduleTime scheduleTime = new ProviderScheduleTime();
      scheduleTime.setProviderSchedule(this);
      scheduleTime.setStartTime(startTime);
      scheduleTime.setEndTime(endTime);
      if (providerScheduleTimeList == null) {
         providerScheduleTimeList = new ArrayList();
      }
      providerScheduleTimeList.add(scheduleTime);
   }

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (id != null ? id.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof ProviderSchedule)) {
         return false;
      }
      ProviderSchedule other = (ProviderSchedule) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.ProviderSchedule[id=" + id + "]";
   }
}