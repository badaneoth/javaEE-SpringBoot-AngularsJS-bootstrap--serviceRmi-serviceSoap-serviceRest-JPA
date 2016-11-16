package org.glsid.metier;

public interface OperationMetier {
	public boolean verser(String code, double montant, Long CodeEmp);
	public boolean retirer(String code, double montant, Long CodeEmp);
	public boolean virement(String cpte1,String  cpte2, double montant, Long CodeEmp);
	public PageOperation getOperations(String codeCompte, int page, int size );
}
