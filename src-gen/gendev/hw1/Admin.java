/**
 */
package gendev.hw1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Admin#getAdminID <em>Admin ID</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getAdmin()
 * @model
 * @generated
 */
public interface Admin extends User {
	/**
	 * Returns the value of the '<em><b>Admin ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin ID</em>' attribute.
	 * @see #setAdminID(int)
	 * @see gendev.hw1.Hw1Package#getAdmin_AdminID()
	 * @model required="true"
	 * @generated
	 */
	int getAdminID();

	/**
	 * Sets the value of the '{@link gendev.hw1.Admin#getAdminID <em>Admin ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin ID</em>' attribute.
	 * @see #getAdminID()
	 * @generated
	 */
	void setAdminID(int value);

} // Admin
