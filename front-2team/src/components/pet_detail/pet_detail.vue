<template>
    <div class="parent_box">
        <div class="left_box">
            <img
            src="../../images/pet_detail/profile_test.jpg"
            id="profile" width="200" height="200">
        </div>

        <div class="middle_box">
            <div class="pet_name">
                애완동물 이름
            </div>
            <div class="first_meeting_day" style="margin-top: 40px;">
                처음만난 날
            </div>
            <div class="pet_age" style="margin-top: 40px;">
                나이
            </div>
            <div class="species" style="margin-top: 40px;">
                종
            </div>
            <div class="kind" style="margin-top: 40px;">
                품종
            </div>
            <div class="neutralization" style="margin-top: 40px;">
                중성화 여부
            </div>
        </div>
        <div class="right_box">
            <div class="back_pet_name">
                {{petlist.name}}
            </div>
            <div class="back_first_meeting_day" style="margin-top: 40px;">
                {{petlist.firstday}}
            </div>
            <div class="back_age" style="margin-top: 40px;">
                {{petlist.age}} 살
            </div>
            <div class="back_species" style="margin-top: 40px;">
                {{petlist.animal}}
            </div>
            <div class="back_kind" style="margin-top: 40px;">
                {{petlist.breed}}
            </div>
            <div class="back_neutralization" style="margin-top: 40px;">
                {{petlist.gender}}
            </div>
        </div>

        <div class="bottom_box">
           <button>확인</button>
           <button>취소</button>
        </div>
    </div>
</template>

<script>
import './pet_detail.css';

export default {
  components: {

  },
  data: () => ({

  }),
  computed: {
      petlist() {
          return this.$store.getters.getPetonelist;
      }
  }
};
</script>
