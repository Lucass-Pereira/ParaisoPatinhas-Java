package dados;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Menu;

// para executar as operacoes CRUD(INSERT, UPDATE, DELETE, SELECT) no bd
public class SistemaDao {

    private Connection conectado;
    private PreparedStatement st;
    private ResultSet resultado;
    private final String url = "jdbc:mysql://localhost:3306/projetopatinhas";
    private final String user = "root";
    private final String senha = "@LUC0b0ai0"; 
 


    // Conectar com BD
    private void conectar() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conectado = DriverManager.getConnection(url, user, senha);
    }

    // Verificar usuario e senha no BD
    public ResultSet validarUsuario(Usuario usuario) throws SQLException, ClassNotFoundException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM usuario WHERE usuario = ? AND senha = ?");
        st.setString(1, usuario.getUsuario());
        st.setString(2, usuario.getSenha());
        ResultSet resultado = st.executeQuery();
        return resultado;
    }
 

    // inserir usuario na tabela do bd
    public void salvarUsuario(Usuario usuario) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("INSERT INTO usuario VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
        st.setString(1, usuario.getUsuario());
        st.setString(2, usuario.getSenha());
        st.setString(3, usuario.getNome());
        st.setString(4, usuario.getDtNasc());
        st.setString(5, usuario.getCpf());
        st.setString(6, usuario.getTelefone());
        st.setString(7, usuario.getEndereco());
        st.setString(8, usuario.getNumero());
        st.setString(9, usuario.getCidade());
        st.setString(10, usuario.getEstado());
        st.setString(11, usuario.getCep());
        st.setString(12, usuario.getAdm());
        st.executeUpdate();
    }

    // excluir usuario na tabela do bd
    public void excluirUsuario(Usuario usuario) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("DELETE FROM usuario where usuario = ?");
        st.setString(1, usuario.getUsuario());
        st.executeUpdate();
    }

    // salvar altercaoes
 
    
     public void alterarDados(Usuario usuario) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("update usuario set senha=?, nome=?, dtnasc=?, cpf=?, telefone=?, endereco=?, numero=?, cidade=?, estado=?, cep=? where usuario = ?");
        st.setString(1, usuario.getSenha());
        st.setString(2, usuario.getNome());
        st.setString(3, usuario.getDtNasc());
        st.setString(4, usuario.getCpf());
        st.setString(5, usuario.getTelefone());
        st.setString(6, usuario.getEndereco());
        st.setString(7, usuario.getNumero());
        st.setString(8, usuario.getCidade());
        st.setString(9, usuario.getEstado());
        st.setString(10, usuario.getCep());
        st.setString(11, usuario.getUsuario());
        st.executeUpdate();
    }

    public Usuario buscarUsuario(String u) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM usuario WHERE usuario = ?");
        st.setString(1, u);
        resultado = st.executeQuery();
        
        Usuario usuario = new Usuario();
        if (resultado.next()) {
            try {
                usuario.setUsuario(resultado.getString("usuario"));
                usuario.setSenha(resultado.getString("senha"));
                usuario.setNome(resultado.getString("nome"));
                usuario.setCpf(resultado.getString("cpf"));
                usuario.setTelefone(resultado.getString("telefone"));
                usuario.setDtNasc(resultado.getString("dtnasc"));
                usuario.setEndereco(resultado.getString("endereco"));
                usuario.setNumero(resultado.getString("numero"));
                usuario.setCidade(resultado.getString("cidade"));
                usuario.setEstado(resultado.getString("estado"));
                usuario.setCep(resultado.getString("cep"));
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return usuario;
    }
    

    public ResultSet listarUsuarios() throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM usuario ORDER BY nome ASC");
        resultado = st.executeQuery();
        return resultado;
    }

    public ResultSet pesquisarUsuario(String u) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM usuario Where usuario = ?");
        st.setString(1, u);
        ResultSet resultado = st.executeQuery();
        return resultado;
    }
    

        public ResultSet listarAnimais() throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM animais ORDER BY idanimal ASC");
        resultado = st.executeQuery();
        return resultado;
    }
     
     // inserir usuario na tabela do bd
    public void salvarAnimal(Animais animais) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("INSERT INTO animais VALUES(?,?,?,?,?)");
        st.setString(1, animais.getIdanimal());
        st.setString(2, animais.getNome());
        st.setString(3, animais.getSexo());
        st.setString(4, animais.getEspecie());
        st.setString(5, animais.getPorte());
       
        st.executeUpdate();
    }
    
    public void alterarAnimal(Animais animais) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("update animais set nome=?, especie=?, sexo=?, porte=? where idanimal = ?");
        st.setString(1, animais.getIdanimal());
        st.setString(2, animais.getNome());
        st.setString(3, animais.getSexo());
        st.setString(4, animais.getEspecie());
        st.setString(5, animais.getPorte());
       
        st.executeUpdate();
    }
    
     public void excluirAnimal(Animais animal) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("DELETE FROM animais where usuario = ?");
        st.setString(1, animal.getIdanimal());
        st.executeUpdate();
    }
     
     public Animais buscarAnimal(String a) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM animais WHERE usuario = ?");
        st.setString(1, a);
        resultado = st.executeQuery();
        
        Animais animais = new Animais();
        if (resultado.next()) {
            try {
                animais.setIdanimal(resultado.getString("idanimal"));
                animais.setNome(resultado.getString("nome"));
                animais.setSexo(resultado.getString("sexo"));
                animais.setEspecie(resultado.getString("especie"));
                animais.setPorte(resultado.getString("porte"));
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return animais;
    }
     
     public ResultSet pesquisarAnimal(String u) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM animais Where idanimal = ?");
        st.setString(1, u);
        ResultSet resultado = st.executeQuery();
        return resultado;
    }
    
}

