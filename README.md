Sistema de Gestao de Voluntarios

Criar um sistema integrado para gestao de Voluntariado no Brasil, que permita o cadastro de membros, controle de tarefas e financeiro.

CRUD -> Create, Read, Update e Delete Definir classe generica para Pessoa

Classes filhas: Voluntario Colaborador Doador

Requisitos: - CRUD Voluntarios -List Voluntarios -Atributos: nome idade genero experiencia habilidades horasDisponiveis motivacao ENUM areaAtuacao pontuacaoTotal -Matodos: inscrever() executarTarefa()

CRUD de tarefas -List Tarefas -Atributos: descricao ENUM areaAtuacao local horario responsavel ajudaDeCusto boolean status normas int qtdVoluntarios pontuacao tempoTotal final static fatorPontuacao -Metodos atualizarPontosVoluntario() atualizarStatus() getAllVoluntarios() calcularPontuacao()

Execuaao de tarefas pelos voluntarios

Controle de pontuacao de tarefas
Create Area de atuaaao Enum Area Atuacao Assistancia social; Educaaao; Saade; Meio ambiente; Direitos humanos; Ajuda humanitaria em situaaaes de emergancia.
Stakeholders ENUMS 1) Voluntario 2) Beneficiario 3) Doadores 4) Colaboradores/Funcionarios da ONG 5) Parceiros e Patrocinadores 6) Governo e Reguladores 7) Madia e Influenciadores

Ex: Eu Everton Rodrigues gostaria de me candidatar a fazer um voluntariado na area de educaaao mas preciso de ajuda de custo .
