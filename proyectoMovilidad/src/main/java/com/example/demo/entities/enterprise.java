package com.example.demo.entities;

import jakarta.persistence.Entity;

@Entity
public class enterprise {

	 private int enterpriseId;
	    private String enterpriseName;
	    private String enterpriseNIT;

	    
	    public enterprise(String enterpriseName, String enterpriseNIT) {
			super();
			this.enterpriseName = enterpriseName;
			this.enterpriseNIT = enterpriseNIT;
		}

		public enterprise (int enterpriseId, String enterpriseName, String enterpriseNIT) {

	        this.enterpriseId = enterpriseId;
	        this.enterpriseName = enterpriseName;
	        this.enterpriseNIT = enterpriseNIT;
	    }

		public int getEnterpriseId() {
			return enterpriseId;
		}

		public void setEnterpriseId(int enterpriseId) {
			this.enterpriseId = enterpriseId;
		}

		public String getEnterpriseName() {
			return enterpriseName;
		}

		public void setEnterpriseName(String enterpriseName) {
			this.enterpriseName = enterpriseName;
		}

		public String getEnterpriseNIT() {
			return enterpriseNIT;
		}

		public void setEnterpriseNIT(String enterpriseNIT) {
			this.enterpriseNIT = enterpriseNIT;
		}
	    
	    
}

