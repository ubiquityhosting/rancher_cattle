/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "image_storage_pool_map", schema = "dstack")
public interface ImageStoragePoolMap extends java.io.Serializable {

	/**
	 * Setter for <code>dstack.image_storage_pool_map.id</code>. 
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.image_storage_pool_map.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>dstack.image_storage_pool_map.template_id</code>. 
	 */
	public void setTemplateId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.image_storage_pool_map.template_id</code>. 
	 */
	@javax.persistence.Column(name = "template_id", nullable = false, precision = 19)
	public java.lang.Long getTemplateId();

	/**
	 * Setter for <code>dstack.image_storage_pool_map.storage_pool_id</code>. 
	 */
	public void setStoragePoolId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.image_storage_pool_map.storage_pool_id</code>. 
	 */
	@javax.persistence.Column(name = "storage_pool_id", nullable = false, precision = 19)
	public java.lang.Long getStoragePoolId();

	/**
	 * Setter for <code>dstack.image_storage_pool_map.progress</code>. 
	 */
	public void setProgress(java.lang.String value);

	/**
	 * Getter for <code>dstack.image_storage_pool_map.progress</code>. 
	 */
	@javax.persistence.Column(name = "progress", length = 255)
	public java.lang.String getProgress();

	/**
	 * Setter for <code>dstack.image_storage_pool_map.resource_state</code>. 
	 */
	public void setResourceState(java.lang.String value);

	/**
	 * Getter for <code>dstack.image_storage_pool_map.resource_state</code>. 
	 */
	@javax.persistence.Column(name = "resource_state", nullable = false, length = 255)
	public java.lang.String getResourceState();

	/**
	 * Setter for <code>dstack.image_storage_pool_map.location</code>. 
	 */
	public void setLocation(java.lang.String value);

	/**
	 * Getter for <code>dstack.image_storage_pool_map.location</code>. 
	 */
	@javax.persistence.Column(name = "location", length = 255)
	public java.lang.String getLocation();

	/**
	 * Setter for <code>dstack.image_storage_pool_map.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value);

	/**
	 * Getter for <code>dstack.image_storage_pool_map.created</code>. 
	 */
	@javax.persistence.Column(name = "created")
	public java.sql.Timestamp getCreated();

	/**
	 * Setter for <code>dstack.image_storage_pool_map.billing_start</code>. 
	 */
	public void setBillingStart(java.sql.Timestamp value);

	/**
	 * Getter for <code>dstack.image_storage_pool_map.billing_start</code>. 
	 */
	@javax.persistence.Column(name = "billing_start")
	public java.sql.Timestamp getBillingStart();

	/**
	 * Setter for <code>dstack.image_storage_pool_map.billing_end</code>. 
	 */
	public void setBillingEnd(java.sql.Timestamp value);

	/**
	 * Getter for <code>dstack.image_storage_pool_map.billing_end</code>. 
	 */
	@javax.persistence.Column(name = "billing_end")
	public java.sql.Timestamp getBillingEnd();

	/**
	 * Setter for <code>dstack.image_storage_pool_map.removed</code>. 
	 */
	public void setRemoved(java.sql.Timestamp value);

	/**
	 * Getter for <code>dstack.image_storage_pool_map.removed</code>. 
	 */
	@javax.persistence.Column(name = "removed")
	public java.sql.Timestamp getRemoved();

	/**
	 * Setter for <code>dstack.image_storage_pool_map.resource_remove_schedule</code>. 
	 */
	public void setResourceRemoveSchedule(java.sql.Timestamp value);

	/**
	 * Getter for <code>dstack.image_storage_pool_map.resource_remove_schedule</code>. 
	 */
	@javax.persistence.Column(name = "resource_remove_schedule")
	public java.sql.Timestamp getResourceRemoveSchedule();

	/**
	 * Setter for <code>dstack.image_storage_pool_map.resource_removed</code>. 
	 */
	public void setResourceRemoved(java.sql.Timestamp value);

	/**
	 * Getter for <code>dstack.image_storage_pool_map.resource_removed</code>. 
	 */
	@javax.persistence.Column(name = "resource_removed")
	public java.sql.Timestamp getResourceRemoved();

	/**
	 * Setter for <code>dstack.image_storage_pool_map.remove_locked</code>. 
	 */
	public void setRemoveLocked(java.lang.Boolean value);

	/**
	 * Getter for <code>dstack.image_storage_pool_map.remove_locked</code>. 
	 */
	@javax.persistence.Column(name = "remove_locked", nullable = false, precision = 1)
	public java.lang.Boolean getRemoveLocked();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ImageStoragePoolMap
	 */
	public void from(io.github.ibuildthecloud.dstack.core.model.ImageStoragePoolMap from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ImageStoragePoolMap
	 */
	public <E extends io.github.ibuildthecloud.dstack.core.model.ImageStoragePoolMap> E into(E into);
}