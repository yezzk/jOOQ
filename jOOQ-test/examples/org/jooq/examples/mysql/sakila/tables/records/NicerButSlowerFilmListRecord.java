/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class NicerButSlowerFilmListRecord extends org.jooq.impl.TableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord> {

	private static final long serialVersionUID = 1311609919;

	/**
	 * An uncommented item
	 */
	public void setFid(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.FID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Short getFid() {
		return getValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.FID);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setDescription(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.DESCRIPTION, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getDescription() {
		return getValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.DESCRIPTION);
	}

	/**
	 * An uncommented item
	 */
	public void setCategory(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.CATEGORY, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getCategory() {
		return getValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.CATEGORY);
	}

	/**
	 * An uncommented item
	 */
	public void setPrice(java.math.BigDecimal value) {
		setValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.PRICE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigDecimal getPrice() {
		return getValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.PRICE);
	}

	/**
	 * An uncommented item
	 */
	public void setLength(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.LENGTH, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Short getLength() {
		return getValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.LENGTH);
	}

	/**
	 * An uncommented item
	 */
	public void setRating(org.jooq.examples.mysql.sakila.enums.NicerButSlowerFilmListRating value) {
		setValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.RATING, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.examples.mysql.sakila.enums.NicerButSlowerFilmListRating getRating() {
		return getValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.RATING);
	}

	/**
	 * An uncommented item
	 */
	public void setActors(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.ACTORS, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getActors() {
		return getValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.ACTORS);
	}

	/**
	 * Create a detached NicerButSlowerFilmListRecord
	 */
	public NicerButSlowerFilmListRecord() {
		super(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST);
	}

	/**
	 * Create an attached NicerButSlowerFilmListRecord
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public NicerButSlowerFilmListRecord(org.jooq.Configuration configuration) {
		super(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST, configuration);
	}
}
