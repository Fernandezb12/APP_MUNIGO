import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.munigo.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupListeners()
    }

    private fun setupListeners() {
        binding.btnLogin.setOnClickListener {
            val username = binding.etUsername.text.toString()
            val password = binding.etPassword.text.toString()

            if (username.isNotEmpty() && password.isNotEmpty()) {
                // Here you would typically call your authentication logic
                // For now, we'll just show a success message
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter username and password", Toast.LENGTH_SHORT).show()
            }
        }

        binding.tvForgotPassword.setOnClickListener {
            // Handle forgot password
            Toast.makeText(this, "Forgot password clicked", Toast.LENGTH_SHORT).show()
        }

        binding.ibtnGoogle.setOnClickListener {
            // Handle Google sign in
            Toast.makeText(this, "Google sign in clicked", Toast.LENGTH_SHORT).show()
        }

        binding.ibtnFacebook.setOnClickListener {
            // Handle Facebook sign in
            Toast.makeText(this, "Facebook sign in clicked", Toast.LENGTH_SHORT).show()
        }
    }
}