simp:
	@echo simping...
	@cd Simpleton && dotnet run $(P)
	@cd Output && dotnet run
