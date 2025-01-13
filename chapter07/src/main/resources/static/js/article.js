// 주석다는 방법 -> 삭제 기능을 구현
const deleteButton = document.getElementById('delete-btn');

if (deleteButton) {
    deleteButton.addEventListener('click', event => {
        let id = document.getElementById('article-id').value;
        fetch(`/api/articles/${id}`, {
            method: 'DELETE'
        })
        .then(() => {
            alert('삭제가 완료되었습니다.');
            location.replace('/articles')
        });
    });
}   // 이제 이게 article.html에서 동작할 수 있도록 작성을 할 예정입니다.