package com.redbus.testing.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelsPage {
	@FindBy(xpath="//span[.='City, area or hotel name']")
	private WebElement cityName;
	
	@FindBy(xpath="//span[.='Check in']")
	private WebElement checkIn;
	
	@FindBy(xpath="//span[.='Check out']")
	private WebElement checkOut;
	
	@FindBy(xpath="//span[.='No. of rooms & guests']")
	private WebElement roomsAndGuests;
	
	@FindBy(xpath="//div[.='Rooms']/..//i[@class='icon___4eb250 icon icon-remove']")
	private WebElement roomsMinusIcon;
	
	@FindBy(xpath="//div[.='Rooms']/..//i[@class='icon___4eb250 icon icon-add']")
	private WebElement roomsPlusIcon;
	
	@FindBy(xpath="//span[.='Adults']/../..//i[@class='icon___4eb250 icon icon-remove']")
	private WebElement adultsMinusIcon;
	
	@FindBy(xpath="//span[.='Adults']/../..//i[@class='icon___4eb250 icon icon-add']")
	private WebElement adultsPlusIcon;
	
	@FindBy(css="[class='addBtn___168d65 ']")
	private WebElement addChildren;
	
	@FindBy(xpath="//span[.='Children']/../..//i[@class='icon___4eb250 icon icon-remove']")
	private WebElement minusChildrenIcon;
	
	@FindBy(xpath="//span[.='Children']/../..//i[@class='icon___4eb250 icon icon-add']")
	private WebElement plusChildrenIcon;
	
	@FindBy(xpath="//div[contains(@class,'childField')]")
	List<WebElement> childFields;
	
	@FindBy(xpath = "//div[@role='option']//span")
	private List<WebElement> ageOptions;
	
	public WebElement getCityName() {
		return cityName;
	}
	
	public void clickCityName() {
		getCityName().click();
	}

	public WebElement getCheckIn() {
		return checkIn;
	}
	
	public void clickCheckIn() {
		getCheckIn().click();
	}

	public WebElement getCheckOut() {
		return checkOut;
	}
	
	public void clickCheckOut() {
		getCheckOut().click();
	}

	public WebElement getRoomsAndGuests() {
		return roomsAndGuests;
	}
	
	public void clickRoomsAndGuests() {
		getRoomsAndGuests().click();
	}

	public WebElement getRoomsMinusIcon() {
		return roomsMinusIcon;
	}
	
	public void decreaseRooms(int count) {
		for(int i = 1; i < count; i++) {
			getRoomsMinusIcon().click();
		}
	}

	public WebElement getRoomsPlusIcon() {
		return roomsPlusIcon;
	}
	
	public void increaseRooms(int count) {
		for(int i = 1; i < count; i++) {
			getRoomsPlusIcon().click();
		}
	}

	public WebElement getAdultsMinusIcon() {
		return adultsMinusIcon;
	}
	
	public void decreaseAdults(int count) {
		for(int i = 1; i < count; i++) {
			getAdultsMinusIcon().click();
		}
	}

	public WebElement getAdultsPlusIcon() {
		return adultsPlusIcon;
	}
	
	public void increaseAdults(int count) {
		for(int i = 1; i < count; i++) {
			getAdultsPlusIcon().click();
		}
	}

	public WebElement getAddChildren() {
		return addChildren;
	}
	
	public void addChildren(int count) {
		for(int i = 0; i < count; i++) {
			getAddChildren().click();
		}
	}
	
	public WebElement getMinusChildrenIcon() {
		return minusChildrenIcon;
	}
	
	public void decreaseChildren(int count) {
		for(int i = 0; i < count; i++) {
			getMinusChildrenIcon().click();
		}
	}
	
	public WebElement getPlusChildrenIcon() {
		return plusChildrenIcon;
	}
	
	public void increaseChildren(int count) {
		for(int i = 1; i < count; i++) {
			getPlusChildrenIcon().click();
		}
	}

	public List<WebElement> getChildFields() {
		return childFields;
	}
	
	public void clickChildField(int index) {
		getChildFields().get(index).click();
	}
	
	public int getChildFieldsCount() {
		return getChildFields().size();
	}
	
	public List<WebElement> getAgeOptions() {
	    return ageOptions;
	}
	
}
