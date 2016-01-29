/**
 * Created by mansi.pattani on 29/1/16.
 */
eventsApp.factory('eventData', function() {
	return {
		event:{
			name: 'Angular Boot Camp',
			date: 1359781015626,
			time: '5:40 pm',
			location: {
				address: 'Google Headquarters',
				city: 'Mountain View',
				province: 'CA'
			},
			imageUrl: '/img/angularjs-logo.png',
			sessions: [
				{
					name: 'Directive Masterclass',
					creatorName: 'Mansi Pattani',
					duration: 1,
					level: 'Advanced',
					abstract: 'In this session you will learn ins and outs of directives',
					upVoteCount: 0
				},
				{
					name: 'Scope for fun and profit',
					creatorName: 'Pooja Mistry',
					duration: 2,
					level: 'Introductory',
					abstract: 'In this session you will learn ins and outs of scopes. Learn what they do, how they do it, and how to get them do it for you.',
					upVoteCount: 0
				},
				{
					name: 'Well behaved Controllers',
					creatorName: 'Kaushali Malaviya',
					duration: 4,
					level: 'Intermediate',
					abstract: 'Controllers are the beginning of everything Angular does. Learn how to craft controller that will win the respect of your friends and neighbours.',
					upVoteCount: 0
				}
			]
		}
	};
});
