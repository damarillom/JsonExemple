package org.escoladeltreball.JSONexemple;

public class Station {
	private String id;
	private String type;
	private String latitude;
	private String longitude;
	private String streetName;
	private String altitude;
	private String slots;
	private String bikes;
	private String nearbyStations;
	private String status;
	/**
	 * @param id
	 * @param type
	 * @param latitude
	 * @param longitude
	 * @param streetName
	 * @param altitude
	 * @param slots
	 * @param bikes
	 * @param nearbyStations
	 * @param status
	 */
	public Station(String id, String type, String latitude, String longitude, String streetName, String altitude,
			String slots, String bikes, String nearbyStations, String status) {
		this.id = id;
		this.type = type;
		this.latitude = latitude;
		this.longitude = longitude;
		this.streetName = streetName;
		this.altitude = altitude;
		this.slots = slots;
		this.bikes = bikes;
		this.nearbyStations = nearbyStations;
		this.status = status;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"Station [id=%s, type=%s, latitude=%s, longitude=%s, streetName=%s, altitude=%s, slots=%s, bikes=%s, nearbyStations=%s, status=%s]",
				id, type, latitude, longitude, streetName, altitude, slots, bikes, nearbyStations, status);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((altitude == null) ? 0 : altitude.hashCode());
		result = prime * result + ((bikes == null) ? 0 : bikes.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((nearbyStations == null) ? 0 : nearbyStations.hashCode());
		result = prime * result + ((slots == null) ? 0 : slots.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Station)) {
			return false;
		}
		Station other = (Station) obj;
		if (altitude == null) {
			if (other.altitude != null) {
				return false;
			}
		} else if (!altitude.equals(other.altitude)) {
			return false;
		}
		if (bikes == null) {
			if (other.bikes != null) {
				return false;
			}
		} else if (!bikes.equals(other.bikes)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (latitude == null) {
			if (other.latitude != null) {
				return false;
			}
		} else if (!latitude.equals(other.latitude)) {
			return false;
		}
		if (longitude == null) {
			if (other.longitude != null) {
				return false;
			}
		} else if (!longitude.equals(other.longitude)) {
			return false;
		}
		if (nearbyStations == null) {
			if (other.nearbyStations != null) {
				return false;
			}
		} else if (!nearbyStations.equals(other.nearbyStations)) {
			return false;
		}
		if (slots == null) {
			if (other.slots != null) {
				return false;
			}
		} else if (!slots.equals(other.slots)) {
			return false;
		}
		if (status == null) {
			if (other.status != null) {
				return false;
			}
		} else if (!status.equals(other.status)) {
			return false;
		}
		if (streetName == null) {
			if (other.streetName != null) {
				return false;
			}
		} else if (!streetName.equals(other.streetName)) {
			return false;
		}
		if (type == null) {
			if (other.type != null) {
				return false;
			}
		} else if (!type.equals(other.type)) {
			return false;
		}
		return true;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}
	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	/**
	 * @return the altitude
	 */
	public String getAltitude() {
		return altitude;
	}
	/**
	 * @param altitude the altitude to set
	 */
	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}
	/**
	 * @return the slots
	 */
	public String getSlots() {
		return slots;
	}
	/**
	 * @param slots the slots to set
	 */
	public void setSlots(String slots) {
		this.slots = slots;
	}
	/**
	 * @return the bikes
	 */
	public String getBikes() {
		return bikes;
	}
	/**
	 * @param bikes the bikes to set
	 */
	public void setBikes(String bikes) {
		this.bikes = bikes;
	}
	/**
	 * @return the nearbyStations
	 */
	public String getNearbyStations() {
		return nearbyStations;
	}
	/**
	 * @param nearbyStations the nearbyStations to set
	 */
	public void setNearbyStations(String nearbyStations) {
		this.nearbyStations = nearbyStations;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
}
