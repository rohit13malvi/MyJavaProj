package com.vz.garage.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="garage_startup_details")
@EntityListeners(AuditingEntityListener.class)
public class GarageStartupDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name="startup_id")
	private Long startupId;
	
	@Column(name="idea_id")
	private Long ideaId;
	
	@Column(name="problem_to_solve")
	private String problemToSolve;
	
	@Column(name="ctxt_for_better_understanding")
	private String contextForBetterUnderstanding;
	
	@Column(name="su_perq")
	private String startupPrerequisities;
	
	@Column(name="uc_importance")
	private String usecaseImportance;
	
	@Column(name="uc_res_urg_info")
	private String usecaseResolutionUrgencyInfo;
	
	@Column(name="stakeholder_buy_in")
	private String stakeholderBuyIn;
	
	@Column(name="fin_resources")
	private String financialResources;
	
	@Column(name="non_fin_resources")
	private String nonFinancialResources;
	
	@Column(name="prev_work_with_su")
	private String previousWorkWithStartup;
	
	@Column(name="obs_of_pship")
	private String observationsOfPartnership;
	
	@Column(name="uc_id")
	private String useCaseID;
	
	@Column(name="uc_priority")
	private String useCasePriority;
	
	@Column(name="uc_status")
	private String useCaseStatus;
	
	@Column(name="active_p1_p2_usecase")
	private String activeP1P2Usecase;

	@CreatedBy
	@Column(name = "created_by",updatable =false)
	private String createdBy;

	
	@Column(name = "updated_by",insertable =false)
	private String updatedBy;
	
	
	@Column(name = "created_date_time",updatable =false)
	@CreationTimestamp
	private Timestamp createdDateTime;
	
	
	@UpdateTimestamp
	@Column(name = "updated_date_time")
	private Timestamp updatedDateTime;
	
	
	@ManyToOne
	@JoinColumn(name = "startup_id",referencedColumnName="id", insertable = false, updatable = false)
	private GarageStartupInfo startupInfo ;
	

	@Column(name="config_id")
	private Long config_id;
	
	@Column(name="current_stage")
	private Long current_stage;
	
	@Column(name="upcoming_stage")
	private Long upcoming_stage;
	
	@Column(name="is_startup_relevant")
	private String IsStartUpRelevant;
	
	@Column(name="portfolio_team_feedback")
	private String portfolioTeamFeedback;
	
	@Column(name = "capturing_feedback_date")
	private Timestamp capturingFeedbackDate;
	
	@Column(name = "sharing_startup_date")
	private Timestamp sharingStartupDate;
	
	@Column(name="connect_required")
	private String connectRequired;
	
	@Column(name="connect_status")
	private String connectStatus;
	
	@Column(name = "shortlisting_startup_first_connect")
	private Timestamp shortlistingStartupFirstConnectDate;
	
	@Column(name = "first_Interaction_with_bu_team")
	private Timestamp firstInteractionWithBUTeamDate;
	
	@Column(name="days_to_provide_feedback")
	private String noOfDaysProvideFeedback;
	
	@Column(name="days_feedback_Pending")
	private String noOfDaysFeedbackPending;
	
	@Column(name="days_first_connect_pending")
	private String noOfDaysFirstConnectPending;
	
	@Column(name="days_first_interaction_made")
	private String noOfDaysFirstInteractionMade;
	
	@Column(name="funding_stage")
	private String fundingStage;
	
	@Column(name="funding_amount")
	private String fundingAmount;
	
	@Column(name="funding_rating")
	private String fundingRating;


	public GarageStartupInfo getStartupInfo() {
		return startupInfo;
	}

	public void setStartupInfo(GarageStartupInfo startupInfo) {
		this.startupInfo = startupInfo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getStartupId() {
		return startupId;
	}

	public void setStartupId(Long startupId) {
		this.startupId = startupId;
	}

	public Long getIdeaId() {
		return ideaId;
	}

	public void setIdeaId(Long ideaId) {
		this.ideaId = ideaId;
	}

	public String getProblemToSolve() {
		return problemToSolve;
	}

	public void setProblemToSolve(String problemToSolve) {
		this.problemToSolve = problemToSolve;
	}

	public String getContextForBetterUnderstanding() {
		return contextForBetterUnderstanding;
	}

	public void setContextForBetterUnderstanding(String contextForBetterUnderstanding) {
		this.contextForBetterUnderstanding = contextForBetterUnderstanding;
	}

	public String getStartupPrerequisities() {
		return startupPrerequisities;
	}

	public void setStartupPrerequisities(String startupPrerequisities) {
		this.startupPrerequisities = startupPrerequisities;
	}

	public String getUsecaseImportance() {
		return usecaseImportance;
	}

	public void setUsecaseImportance(String usecaseImportance) {
		this.usecaseImportance = usecaseImportance;
	}

	public String getUsecaseResolutionUrgencyInfo() {
		return usecaseResolutionUrgencyInfo;
	}

	public void setUsecaseResolutionUrgencyInfo(String usecaseResolutionUrgencyInfo) {
		this.usecaseResolutionUrgencyInfo = usecaseResolutionUrgencyInfo;
	}

	public String getStakeholderBuyIn() {
		return stakeholderBuyIn;
	}

	public void setStakeholderBuyIn(String stakeholderBuyIn) {
		this.stakeholderBuyIn = stakeholderBuyIn;
	}

	public String getFinancialResources() {
		return financialResources;
	}

	public void setFinancialResources(String financialResources) {
		this.financialResources = financialResources;
	}

	public String getNonFinancialResources() {
		return nonFinancialResources;
	}

	public void setNonFinancialResources(String nonFinancialResources) {
		this.nonFinancialResources = nonFinancialResources;
	}

	public String getPreviousWorkWithStartup() {
		return previousWorkWithStartup;
	}

	public void setPreviousWorkWithStartup(String previousWorkWithStartup) {
		this.previousWorkWithStartup = previousWorkWithStartup;
	}

	public String getObservationsOfPartnership() {
		return observationsOfPartnership;
	}

	public void setObservationsOfPartnership(String observationsOfPartnership) {
		this.observationsOfPartnership = observationsOfPartnership;
	}

	public String getUseCaseID() {
		return useCaseID;
	}

	public void setUseCaseID(String useCaseID) {
		this.useCaseID = useCaseID;
	}

	public String getUseCasePriority() {
		return useCasePriority;
	}

	public void setUseCasePriority(String useCasePriority) {
		this.useCasePriority = useCasePriority;
	}

	public String getUseCaseStatus() {
		return useCaseStatus;
	}

	public void setUseCaseStatus(String useCaseStatus) {
		this.useCaseStatus = useCaseStatus;
	}

	public String getActiveP1P2Usecase() {
		return activeP1P2Usecase;
	}

	public void setActiveP1P2Usecase(String activeP1P2Usecase) {
		this.activeP1P2Usecase = activeP1P2Usecase;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Timestamp getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setUpdatedDateTime(Timestamp updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public Long getConfig_id() {
		return config_id;
	}

	public void setConfig_id(Long config_id) {
		this.config_id = config_id;
	}

	public Long getCurrent_stage() {
		return current_stage;
	}

	public void setCurrent_stage(Long current_stage) {
		this.current_stage = current_stage;
	}

	public Long getUpcoming_stage() {
		return upcoming_stage;
	}

	public void setUpcoming_stage(Long upcoming_stage) {
		this.upcoming_stage = upcoming_stage;
	}

	public String getIsStartUpRelevant() {
		return IsStartUpRelevant;
	}

	public void setIsStartUpRelevant(String isStartUpRelevant) {
		IsStartUpRelevant = isStartUpRelevant;
	}

	public String getPortfolioTeamFeedback() {
		return portfolioTeamFeedback;
	}

	public void setPortfolioTeamFeedback(String portfolioTeamFeedback) {
		this.portfolioTeamFeedback = portfolioTeamFeedback;
	}

	public Timestamp getCapturingFeedbackDate() {
		return capturingFeedbackDate;
	}

	public void setCapturingFeedbackDate(Timestamp capturingFeedbackDate) {
		this.capturingFeedbackDate = capturingFeedbackDate;
	}

	public Timestamp getSharingStartupDate() {
		return sharingStartupDate;
	}

	public void setSharingStartupDate(Timestamp sharingStartupDate) {
		this.sharingStartupDate = sharingStartupDate;
	}

	public String getConnectRequired() {
		return connectRequired;
	}

	public void setConnectRequired(String connectRequired) {
		this.connectRequired = connectRequired;
	}

	public String getConnectStatus() {
		return connectStatus;
	}

	public void setConnectStatus(String connectStatus) {
		this.connectStatus = connectStatus;
	}

	public Timestamp getShortlistingStartupFirstConnectDate() {
		return shortlistingStartupFirstConnectDate;
	}

	public void setShortlistingStartupFirstConnectDate(Timestamp shortlistingStartupFirstConnectDate) {
		this.shortlistingStartupFirstConnectDate = shortlistingStartupFirstConnectDate;
	}

	public Timestamp getFirstInteractionWithBUTeamDate() {
		return firstInteractionWithBUTeamDate;
	}

	public void setFirstInteractionWithBUTeamDate(Timestamp firstInteractionWithBUTeamDate) {
		this.firstInteractionWithBUTeamDate = firstInteractionWithBUTeamDate;
	}

	public String getNoOfDaysProvideFeedback() {
		return noOfDaysProvideFeedback;
	}

	public void setNoOfDaysProvideFeedback(String noOfDaysProvideFeedback) {
		this.noOfDaysProvideFeedback = noOfDaysProvideFeedback;
	}

	public String getNoOfDaysFeedbackPending() {
		return noOfDaysFeedbackPending;
	}

	public void setNoOfDaysFeedbackPending(String noOfDaysFeedbackPending) {
		this.noOfDaysFeedbackPending = noOfDaysFeedbackPending;
	}

	public String getNoOfDaysFirstConnectPending() {
		return noOfDaysFirstConnectPending;
	}

	public void setNoOfDaysFirstConnectPending(String noOfDaysFirstConnectPending) {
		this.noOfDaysFirstConnectPending = noOfDaysFirstConnectPending;
	}

	public String getNoOfDaysFirstInteractionMade() {
		return noOfDaysFirstInteractionMade;
	}

	public void setNoOfDaysFirstInteractionMade(String noOfDaysFirstInteractionMade) {
		this.noOfDaysFirstInteractionMade = noOfDaysFirstInteractionMade;
	}

	public String getFundingStage() {
		return fundingStage;
	}

	public void setFundingStage(String fundingStage) {
		this.fundingStage = fundingStage;
	}

	public String getFundingAmount() {
		return fundingAmount;
	}

	public void setFundingAmount(String fundingAmount) {
		this.fundingAmount = fundingAmount;
	}

	public String getFundingRating() {
		return fundingRating;
	}

	public void setFundingRating(String fundingRating) {
		this.fundingRating = fundingRating;
	}

	@Override
	public String toString() {
		return "GarageStartupDetails [id=" + id + ", startupId=" + startupId + ", ideaId=" + ideaId
				+ ", problemToSolve=" + problemToSolve + ", contextForBetterUnderstanding="
				+ contextForBetterUnderstanding + ", startupPrerequisities=" + startupPrerequisities
				+ ", usecaseImportance=" + usecaseImportance + ", usecaseResolutionUrgencyInfo="
				+ usecaseResolutionUrgencyInfo + ", stakeholderBuyIn=" + stakeholderBuyIn + ", financialResources="
				+ financialResources + ", nonFinancialResources=" + nonFinancialResources + ", previousWorkWithStartup="
				+ previousWorkWithStartup + ", observationsOfPartnership=" + observationsOfPartnership + ", useCaseID="
				+ useCaseID + ", useCasePriority=" + useCasePriority + ", useCaseStatus=" + useCaseStatus
				+ ", activeP1P2Usecase=" + activeP1P2Usecase + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy
				+ ", createdDateTime=" + createdDateTime + ", updatedDateTime=" + updatedDateTime + ", startupInfo="
				+ startupInfo + ", config_id=" + config_id + ", current_stage=" + current_stage + ", upcoming_stage="
				+ upcoming_stage + ", IsStartUpRelevant=" + IsStartUpRelevant + ", portfolioTeamFeedback="
				+ portfolioTeamFeedback + ", capturingFeedbackDate=" + capturingFeedbackDate + ", sharingStartupDate="
				+ sharingStartupDate + ", connectRequired=" + connectRequired + ", connectStatus=" + connectStatus
				+ ", shortlistingStartupFirstConnectDate=" + shortlistingStartupFirstConnectDate
				+ ", firstInteractionWithBUTeamDate=" + firstInteractionWithBUTeamDate + ", noOfDaysProvideFeedback="
				+ noOfDaysProvideFeedback + ", noOfDaysFeedbackPending=" + noOfDaysFeedbackPending
				+ ", noOfDaysFirstConnectPending=" + noOfDaysFirstConnectPending + ", noOfDaysFirstInteractionMade="
				+ noOfDaysFirstInteractionMade + ", fundingStage=" + fundingStage + ", fundingAmount=" + fundingAmount
				+ ", fundingRating=" + fundingRating + "]";
	}

	

	

}
