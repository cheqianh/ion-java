package tools.events;

import com.amazon.ion.SymbolTable;

public class ImportDescriptor {
    private final String importName;
    private final int maxId;
    private final int version;

    public ImportDescriptor(SymbolTable symbolTable) {
        this.importName = symbolTable.getName();
        this.maxId = symbolTable.getMaxId();
        this.version = symbolTable.getVersion();
    }

    final int getVersion() {
        return version;
    }

    final int getMax_id() {
        return maxId;
    }

    final String getImport_name() {
        return importName;
    }
}
