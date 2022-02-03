package com.delivery.delivery.model;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import com.delivery.delivery.enums.Flavor01;
import com.delivery.delivery.enums.Flavor02;
import com.delivery.delivery.enums.Flavor03;
import com.delivery.delivery.enums.Grams;
import com.delivery.delivery.enums.Payment;
import com.delivery.delivery.enums.Product;


@Entity
public class Client {
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Email")
	private String email;
	@Column(name = "Phone")
	private Integer phone;
	@Column(name = "Adress")
	private String adress;
	@Column(name = "Street")
	private String street;
	@Column(name = "Complement")
	private String complement;
	@Column(name = "Town")
	private String town;
	@Column(name = "Date_Time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private Date date;
	
	@Enumerated(EnumType.STRING)
	private Product product;
	@Enumerated(EnumType.STRING)
	private Grams grams;
	@Enumerated(EnumType.STRING)
	private Flavor01 flavor01;
	@Enumerated(EnumType.STRING)
	private Flavor02 flavor02;
	@Enumerated(EnumType.STRING)
	private Flavor03 flavor03;
	@Enumerated(EnumType.STRING)
	private Payment payment;
	
	public Client() {
		
	}

	public Client(Integer id, 
			String name, 
			String email, 
			Integer phone, 
			String adress, 
			String street,
			String complement,
			String town,
			Date date, 
			Product product, 
			Grams grams, 
			Flavor01 flavor01, 
			Flavor02 flavor02,
			Flavor03 flavor03, 
			Payment payment) {

			this.id = id;
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.adress = adress;
			this.street = street;
			this.complement = complement;
			this.town = town;
			this.date = date;
			this.product = product;
			this.grams = grams;
			this.flavor01 = flavor01;
			this.flavor02 = flavor02;
			this.flavor03 = flavor03;
			this.payment = payment;
	}



	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Grams getGrams() {
		return grams;
	}

	public void setGrams(Grams grams) {
		this.grams = grams;
	}

	public Flavor01 getFlavor01() {
		return flavor01;
	}

	public void setFlavor01(Flavor01 flavor01) {
		this.flavor01 = flavor01;
	}

	public Flavor02 getFlavor02() {
		return flavor02;
	}

	public void setFlavor02(Flavor02 flavor02) {
		this.flavor02 = flavor02;
	}

	public Flavor03 getFlavor03() {
		return flavor03;
	}

	public void setFlavor03(Flavor03 flavor03) {
		this.flavor03 = flavor03;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Client [name=" + name
				+ ", email=" + email +
				", phone=" + phone + 
				", adress=" + adress + 
				", street="+ street + 
				", complement=" + complement + 
				", town=" + town + 
				", date=" + sdf.format(date) + 
				", product=" + product
				+ ", grams=" + grams + 
				", flavor01=" + flavor01 + 
				", flavor02=" + flavor02 + 
				", flavor03=" + flavor03
				+ ", payment=" + payment + "]";
	}

}
