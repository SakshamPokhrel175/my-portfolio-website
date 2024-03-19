/*document.addEventListener('DOMContentLoaded', function () {
    const sections = document.querySelectorAll('.section');

    const fadeInSections = () => {
        sections.forEach(section => {
            if (isElementInViewport(section)) {
                section.classList.add('fadeIn');
            }
        });
    };

    const isElementInViewport = (el) => {
        const rect = el.getBoundingClientRect();
        return (
            rect.top >= 0 &&
            rect.left >= 0 &&
            rect.bottom <= (window.innerHeight || document.documentElement.clientHeight) &&
            rect.right <= (window.innerWidth || document.documentElement.clientWidth)
        );
    };

    fadeInSections();

    window.addEventListener('scroll', fadeInSections);
});
*/