--V2: Migrations para adicionar a coluna de TEMPO na tabela cadastros

ALTER TABLE tb_cadastro
ADD COLUMN tempo VARCHAR(255);