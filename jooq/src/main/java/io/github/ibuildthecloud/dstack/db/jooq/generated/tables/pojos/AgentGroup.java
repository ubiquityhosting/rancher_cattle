/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.db.jooq.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "agent_group", schema = "dstack")
public class AgentGroup implements io.github.ibuildthecloud.dstack.db.jooq.generated.model.AgentGroup {

	private static final long serialVersionUID = 2077780391;

	private final java.lang.Long               id;
	private final java.lang.String             name;
	private final java.lang.String             description;
	private final java.util.Map<String,Object> data;
	private final java.lang.String             state;

	public AgentGroup(
		java.lang.Long               id,
		java.lang.String             name,
		java.lang.String             description,
		java.util.Map<String,Object> data,
		java.lang.String             state
	) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.data = data;
		this.state = state;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return this.id;
	}

	@javax.persistence.Column(name = "name", length = 255)
	@Override
	public java.lang.String getName() {
		return this.name;
	}

	@javax.persistence.Column(name = "description", length = 1024)
	@Override
	public java.lang.String getDescription() {
		return this.description;
	}

	@javax.persistence.Column(name = "data", length = 16777215)
	@Override
	public java.util.Map<String,Object> getData() {
		return this.data;
	}

	@javax.persistence.Column(name = "state", nullable = false, length = 255)
	@Override
	public java.lang.String getState() {
		return this.state;
	}
}