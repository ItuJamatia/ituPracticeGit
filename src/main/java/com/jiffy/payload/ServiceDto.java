package com.jiffy.payload;

public class ServiceDto {

    private Long id;
    private String serviceName;
    private String address;
    private String description;
    private ServiceCategoryDto serviceCategory;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ServiceCategoryDto getServiceCategory() {
		return serviceCategory;
	}
	public void setServiceCategory(ServiceCategoryDto serviceCategory) {
		this.serviceCategory = serviceCategory;
	}
	public ServiceDto() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

    // Constructors, getters, and setters
    
    
}
