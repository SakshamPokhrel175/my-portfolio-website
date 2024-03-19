/*document.addEventListener('DOMContentLoaded', function () {
    const form = document.getElementById('contact-form');

    form.addEventListener('submit', function (event) {
        event.preventDefault();
        const formData = new FormData(form);
        const formDataSerialized = Object.fromEntries(formData.entries());
        // Send the form data to your backend using AJAX or any other method
        console.log(formDataSerialized);
        // For now, let's just alert the form data
        alert('Form submitted successfully!\n' + JSON.stringify(formDataSerialized));
        form.reset(); // Reset the form after submission
    });
});
*/