/**
 */
package gendev.hw1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Discount#getDiscountID <em>Discount ID</em>}</li>
 *   <li>{@link gendev.hw1.Discount#getName <em>Name</em>}</li>
 *   <li>{@link gendev.hw1.Discount#isIsActive <em>Is Active</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getDiscount()
 * @model
 * @generated
 */
public interface Discount extends EObject {
	/**
	 * Returns the value of the '<em><b>Discount ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount ID</em>' attribute.
	 * @see #setDiscountID(int)
	 * @see gendev.hw1.Hw1Package#getDiscount_DiscountID()
	 * @model required="true"
	 * @generated
	 */
	int getDiscountID();

	/**
	 * Sets the value of the '{@link gendev.hw1.Discount#getDiscountID <em>Discount ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount ID</em>' attribute.
	 * @see #getDiscountID()
	 * @generated
	 */
	void setDiscountID(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gendev.hw1.Hw1Package#getDiscount_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gendev.hw1.Discount#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see gendev.hw1.Hw1Package#getDiscount_IsActive()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link gendev.hw1.Discount#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

} // Discount
