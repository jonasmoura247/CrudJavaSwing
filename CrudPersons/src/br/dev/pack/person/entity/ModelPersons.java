package br.dev.pack.person.entity;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jonas
 */
public class ModelPersons extends AbstractTableModel {

    ArrayList<Person> persons = new ArrayList();

    String[] columns = {
        "Nome Completo",
        "Telefone",
        "Sexo",
        "Nome da Mae",
        "Nome do Pai",
        "Data de Nascimento",
        "Convenio",
        "CEP",
        "logradouro",
        "bairro",
        "cidade"
    };

    public void registerPerson(Person p) {
        persons.add(p);
        this.fireTableDataChanged();
    }

    public Person returnPerson(int index) {
        return persons.get(index);
    }

    public void updatePerson(int index, Person p) {
        persons.set(index, p);
        this.fireTableDataChanged();
    }

    public void removePerson(int index) {
        persons.remove(index);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return persons.size();

    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return persons.get(rowIndex).getName();
        } else if (columnIndex == 1) {
            return persons.get(rowIndex).getPhone();
        } else if (columnIndex == 2) {
            return persons.get(rowIndex).getSex();
        } else if (columnIndex == 3) {
            return persons.get(rowIndex).getMother();
        } else if (columnIndex == 4) {
            return persons.get(rowIndex).getFather();
        } else if (columnIndex == 5) {
            return persons.get(rowIndex).getDateB();
        } else if (columnIndex == 6) {
            return persons.get(rowIndex).getConv();
        } else if (columnIndex == 7) {
            return persons.get(rowIndex).getCep();
        } else if (columnIndex == 8) {
            return persons.get(rowIndex).getStreet();
        } else if (columnIndex == 9) {
            return persons.get(rowIndex).getDistrict();
        } else {
            return persons.get(rowIndex).getCity();
        }
    }
}
