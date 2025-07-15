package com.dogancan.cards.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Cards extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cardId;

	private String mobileNumber;

	private String cardNumber;

	private String cardType;

	private int totalLimit;

	private int amountUsed;

	private int availableAmount;

	// Parametresiz Constructor
	public Cards() {
	}

	// Tüm alanlar için Constructor
	public Cards(Long cardId, String mobileNumber, String cardNumber, String cardType,
				 int totalLimit, int amountUsed, int availableAmount,
				 LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
		this.cardId = cardId;
		this.mobileNumber = mobileNumber;
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.totalLimit = totalLimit;
		this.amountUsed = amountUsed;
		this.availableAmount = availableAmount;
		// BaseEntity alanları setter ile set edilebilir
		this.setCreatedAt(createdAt);
		this.setCreatedBy(createdBy);
		this.setUpdatedAt(updatedAt);
		this.setUpdatedBy(updatedBy);
	}

	// Getter ve Setter metodları

	public Long getCardId() {
		return cardId;
	}

	public void setCardId(Long cardId) {
		this.cardId = cardId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getTotalLimit() {
		return totalLimit;
	}

	public void setTotalLimit(int totalLimit) {
		this.totalLimit = totalLimit;
	}

	public int getAmountUsed() {
		return amountUsed;
	}

	public void setAmountUsed(int amountUsed) {
		this.amountUsed = amountUsed;
	}

	public int getAvailableAmount() {
		return availableAmount;
	}

	public void setAvailableAmount(int availableAmount) {
		this.availableAmount = availableAmount;
	}

	// toString metodu

	@Override
	public String toString() {
		return "Cards{" +
				"cardId=" + cardId +
				", mobileNumber='" + mobileNumber + '\'' +
				", cardNumber='" + cardNumber + '\'' +
				", cardType='" + cardType + '\'' +
				", totalLimit=" + totalLimit +
				", amountUsed=" + amountUsed +
				", availableAmount=" + availableAmount +
				", createdAt=" + getCreatedAt() +
				", createdBy='" + getCreatedBy() + '\'' +
				", updatedAt=" + getUpdatedAt() +
				", updatedBy='" + getUpdatedBy() + '\'' +
				'}';
	}
}
