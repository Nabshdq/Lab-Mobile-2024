package com.example.h071221083_tuprak2;

// Import statement untuk kelas dan library Android yang diperlukan
import android.media.Image;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

// Definisi kelas MainActivity, yang meng-extends AppCompatActivity
public class MainActivity extends AppCompatActivity {
    // Deklarasi variabel anggota kelas
    private Button button;
    private ImageView imageView;
    private EditText name;
    private EditText username;
    private Uri image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Mengatur konten aktivitas dari sumber layout
        setContentView(R.layout.activity_main);

        // Inisialisasi variabel anggota dengan tampilan dari layout
        button = findViewById(R.id.submitForm);
        imageView = findViewById(R.id.imageButton);
        name = findViewById(R.id.name);
        username = findViewById(R.id.username);

        // Mengatur OnClickListener untuk imageView (tombol gambar)
        imageView.setOnClickListener(view -> {
            // Membuat intent untuk memilih gambar dari galeri
            Intent openGallery = new Intent(Intent.ACTION_PICK);
            openGallery.setType("image/*");
            // Meluncurkan intent untuk membuka galeri
            launcherIntentGallery.launch(openGallery);
        });

        button.setOnClickListener(view -> {
            // Mendapatkan nilai teks dari EditText
            String editNameValue = name.getText().toString();
            String editUsernameValue = username.getText().toString();

            // Cek jika name, username atau image kosong
            if(editNameValue.isEmpty() || editUsernameValue.isEmpty() || image == null) {
                // Tampilkan pesan kesalahan
                Toast.makeText(MainActivity.this, "Foto, Nama, dan Username harus diisi", Toast.LENGTH_SHORT).show();
            } else {
                // Jika tidak kosong, lanjutkan ke Activity lain
                Intent intent = new Intent(MainActivity.this, NoteActiivity.class);
                intent.putExtra("name", editNameValue);
                intent.putExtra("username", editUsernameValue);
                intent.putExtra("image", image);
                startActivity(intent);
            }
        });
    }

    // ActivityResultLauncher untuk menangani hasil memilih gambar dari galeri
    ActivityResultLauncher<Intent> launcherIntentGallery = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(), result -> {
                if (result.getResultCode() == Activity.RESULT_OK){
                    // Mendapatkan data (URI gambar yang dipilih) dari hasil intent
                    Intent data = result.getData();
                    image = data.getData();
                    // Mengatur gambar yang dipilih ke imageView
                    imageView.setImageURI(image);
                }
            }
    );
}
