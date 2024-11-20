#! /bin/bash

echo "Criando um diretório..."
criar_diretorio=$(mkdir nova_pasta)

echo "$criar_diretorio"
validar_criacao = $criar_diretorio
if [ "$validar_criacao" ]; then
	echo "Diretório criado com sucesso"
else
	echo "Não foi possível criar diretório"
fi

echo "Criando arquivo..."
criar_arquivo=$(touch novo_arquivo.txt)

echo "$criar_arquivo"
if ["$criar_diretorio" ]; then
        echo "Arquivo criado com sucesso"
else
        echo "Não foi possível criar arquivo"
fi

echo "Copiando arquivo para diretório criado..."
copiar_para=$(cp novo_arquivo.txt nova_pasta)

echo "$copiar_para"
if [ $copiar_para ]; then
        echo "Cópia feita com sucesso"
else
        echo "Não foi possível copiar arquivo";
fi